package BinaryTree;

public class TreeElement {
    private int elementVale;
    private TreeElement leftElement;
    private TreeElement rightElement;

    public TreeElement() {
    }

    public TreeElement(int elementValue) {
        this.elementVale = elementValue;
    }

    public TreeElement(int elementVale, TreeElement leftElement, TreeElement rightElement) {
        this.elementVale = elementVale;
        this.leftElement = leftElement;
        this.rightElement = rightElement;
    }

    public int getElementVale() {
        return elementVale;
    }

    public void setElementVale(int elementVale) {
        this.elementVale = elementVale;
    }

    public TreeElement getLeftElement() {
        return leftElement;
    }

    public void setLeftElement(TreeElement leftElement) {
        this.leftElement = leftElement;
    }

    public TreeElement getRightElement() {
        return rightElement;
    }

    public void setRightElement(TreeElement rightElement) {
        this.rightElement = rightElement;
    }

    @Override
    public String toString() {
        return "TreeElement{" +
                "elementVale=" + elementVale +
                ", leftElement=" + leftElement +
                ", rightElement=" + rightElement +
                '}';
    }
}
