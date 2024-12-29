#include <iostream>
#include <vector>
#include <queue>
#include <unordered_map>
#include <limits>

using namespace std;


typedef struct TreeNode TreeNode;
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

vector<int> top_view(TreeNode *root)
{
    unordered_map<int, int> m;
    queue<pair<TreeNode*, int>> q;
    int min_dist = numeric_limits<int>::max();
    int max_dist = numeric_limits<int>::min();

    TreeNode *node;
    int dist;
    q.push({root, 0});
    while (!q.empty()) {
        node = q.front().first;
        dist = q.front().second;
        q.pop();
        if (m.find(dist) == m.end()) {
            if (dist < min_dist)
                min_dist = dist;
            if (dist > max_dist)
                max_dist = dist;
            m[dist] = node->val;
        }
        if (node->left)
            q.push({node->left, dist - 1});
        if (node->right)
            q.push({node->right, dist + 1});
    }

    vector<int> res(max_dist - min_dist + 1);
    for (int i = min_dist; i <= max_dist; ++i) {
        res[i - min_dist] = m[i];
    }
    return res;
}

int main()
{
    TreeNode *root = new TreeNode(1);
    root->right = new TreeNode(3);
    root->left = new TreeNode(2);
    root->left->right = new TreeNode(4);
    root->left->right->right = new TreeNode(5);
    root->left->right->right->right = new TreeNode(6);

    vector<int> res = top_view(root);
    for (size_t i = 0; i < res.size(); ++i) {
        cout << res[i] << ", ";
    }
    cout << endl;

    return 0;
}
