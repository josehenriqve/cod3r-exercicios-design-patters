package br.com.cod3r.exercicios.flyweight.forest;

import br.com.cod3r.exercicios.flyweight.trees.Tree;
import br.com.cod3r.exercicios.flyweight.trees.TreeFactory;
import br.com.cod3r.exercicios.flyweight.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Forest extends JFrame {
        private List<Tree> trees = new ArrayList<>();
        private Set<TreeType> treeTypeSet = new HashSet<>();
        private List<TreeType> treeType = new ArrayList<>();

        public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
            TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
            treeTypeSet.add(type);
            treeType.add(type);
            Tree tree = new Tree(x, y, type);
            trees.add(tree);
        }

    public String compareSize(){
            return "Tree type ="+this.treeType.size()+ "Tree type set = "+this.treeTypeSet.size();
    }
    public Set<TreeType> getTreeTypeSet() {
        return treeTypeSet;
    }

    public void setTreeTypeSet(Set<TreeType> treeTypeSet) {
        this.treeTypeSet = treeTypeSet;
    }

    public List<TreeType> getTreeType() {
        return treeType;
    }

    public void setTreeType(List<TreeType> treeType) {
        this.treeType = treeType;
    }

    @Override
        public void paint(Graphics graphics) {
            for (Tree tree : trees) {
                tree.draw(graphics);
            }
        }
    }

