public class LearningLinks {
    public static void main(String[] args)
    {
        Node one = new Node(20);

        one.setLink(new Node(33));

        Node three = new Node(48);
        one.getNext().setLink(three);

        Node temp = one;
        System.out.println(temp);
        while (temp.getNext() != null)
        {
            temp = temp.getNext();
            System.out.println(temp);
        }
        temp.setLink(new Node(59));

        System.out.println("-----");

        Node two = one.getNext();
        one.setLink(new Node(2));
        one.getNext().setLink(two);


        Node temp2 = one;
        System.out.println(temp2);
        while (temp2.getNext().getNext() != null)
        {
            temp2 = temp2.getNext();
        }

        temp2.setLink(null);



        System.out.println("-----");

        Node temp3 = one;
        System.out.println(temp3);
        while (temp3.getNext() != null)
        {
            temp3 = temp3.getNext();
            System.out.println(temp3);
        }

    }
}
