class SortApp {
    public static void main(String[] args) throws Exception {
        
        Sortable sort = new Sortable();
        int[] tab = {5,4,3,2,1};
        int[] tab2 = sort.sort(tab);

        for(int i = 0; i < tab2.length; i++){
            System.out.println(tab2[i]);
        }
    }
}
