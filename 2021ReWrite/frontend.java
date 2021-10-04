import java.util.Scanner;

public class Frontend {
    public void UserInput ( ){

        System.out.println("enter your menu selection");
        Scanner scan = new Scanner(System.in);
        int selection = scan.nextInt();
    }

    public void ActionMenu (int selection){
        switch (selection){
            case 1: //add
                Backend add = new Backend();
                add.add();
            case 2: //remove
                Backend remove = new Backend();
                remove.remove();
            case 3: //search
                Backend search  = new Backend();
                search.search;
            case 4: //modify
                Backend modify  = new Backend();
                modify.ModifyItem;
        }
    }
}
