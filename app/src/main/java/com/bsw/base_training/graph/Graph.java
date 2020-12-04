package com.bsw.base_training.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author shiwei
 * @Date 2020/12/4-14:28
 * @Email shiweibsw@gmail.com
 */
class Graph {
    private int v;
    private LinkedList<Integer>[] adj;

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int t) {
        adj[s].add(t);
        adj[t].add(s);
    }

    /**
     * 广度优先搜索
     *
     * @param s
     * @param t
     */
    public void bfs(int s, int t) {
        if (s == t) return;
        boolean[] visited = new boolean[v];//是用来记录已经被访问的顶点，用来避免顶点被重复访问。
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();//用来存储已经被访问、但相连的顶点还没有被访问的顶点。
        queue.add(s);
        int[] prev = new int[v];//用来记录搜索路径
        for (int i = 0; i < v; i++) {
            prev[i] = -1;
        }
        while (queue.size() != 0) {
            int w = queue.poll();
            for (int i = 0; i < adj[w].size(); i++) {
                int q = adj[w].get(i);
                if (!visited[q]) {
                    prev[q] = w;
                    if (q == t) {
                        print(prev, s, t);
                        return;
                    }
                    visited[q] = true;
                    queue.add(q);
                }
            }
        }
    }


    private void print(int[] prev, int s, int t) {
        if (prev[t] != -1 && t != s) {
            print(prev, s, prev[t]);
        }
        System.out.print(t + " ");
    }


    boolean found = false;

    /**
     * 深度优先搜索
     *
     * @param s
     * @param t
     */
    public void dfs(int s, int t) {
        found = false;
        boolean[] visited = new boolean[v];//是用来记录已经被访问的顶点，用来避免顶点被重复访问。
        int[] prev = new int[v];//用来记录搜索路径
        for (int i = 0; i < v; i++) {
            prev[i] = -1;
        }
        recurDfs(s, t, visited, prev);
        print(prev, s, t);
    }

    private void recurDfs(int s, int t, boolean[] visited, int[] prev) {
        if (found) return;
        visited[s] = true;
        if (s == t) {
            found = true;
            return;
        }
        for (int i = 0; i < adj[s].size(); i++) {
            int q = adj[s].get(i);
            if (!visited[q]) {
                prev[q] = s;
                recurDfs(q, t, visited, prev);
            }
        }
    }
}
