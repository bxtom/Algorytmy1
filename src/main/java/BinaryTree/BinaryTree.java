package BinaryTree;

public class BinaryTree {
    public static TreeElement generateRandomBinarryTree(int elementsNumber, double probability, int range) {
        TreeElement rootElement = new TreeElement((int) (Math.random() * range));
        TreeElement currentElement = rootElement;

        for (int i = 0; i < elementsNumber - 1; i++) {
            TreeElement newElement = new TreeElement((int) (Math.random() * range));
            boolean newElementWasAdded = false;
            do {
                /* idziemy w lewe poddrzewo */
                if(Math.random() < probability) {
                    if (currentElement.getLeftElement() != null) {
                        /* skaczemy na element który wskazuje lewy wskaźnik */
                        currentElement = currentElement.getLeftElement();
                    } else {
                        /* ustawiamy lewy wskaźnik aktualnemu elementowy na nowo utworzony */
                        currentElement.setLeftElement(newElement);
                        newElementWasAdded = true;
                    }

                /* idziemy w prawe poddrzewo */
                } else {
                    if (currentElement.getRightElement() != null) {
                        /* skaczemy na element który wskazuje prawy wskaźnik */
                        currentElement = currentElement.getRightElement();
                    } else {
                        /* ustawiamy prawy wskaźnik aktualnemu elementowy na nowo utworzony */
                        currentElement.setRightElement(newElement);
                        newElementWasAdded = true;
                    }
                }
            } while (!newElementWasAdded);
        }

        return rootElement;
    }

    public static void main(String[] args) {
        TreeElement element = generateRandomBinarryTree(5, 0.5, 5);
    }
}
