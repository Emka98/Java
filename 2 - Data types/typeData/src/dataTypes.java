class dataTypes {
    public static void main(String[] args) throws Exception {
        
        String name = "Jan";
        String surename = "Kowalski";
        int age = 25;
        boolean answer1 = true;
        boolean answer2 = true;

        //Sposób 1
        System.out.println("Cześć" + name + ", słyszałem, że masz " + age + " lat i uczysz się programowania. Czy to prawda?");
        System.out.println(answer1);
        System.out.println("Czy Twoje inicjały to " + name.charAt(0) + " " + surename.charAt(0) + " ?");
        System.out.println("Tak, " + answer2);

        //Sposób 2 
        System.out.printf("Cześć %s, słyszałem, że masz %d lat i uczysz się programowania. Czy to prawda?\n",name,age);
        System.out.println(answer1);
        System.out.printf("Czy Twoje inicjały to %s %s\n", name.charAt(0), surename.charAt(0));
        System.out.printf("Tak, %s", answer2);

    
    
    }
}
