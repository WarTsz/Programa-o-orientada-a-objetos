public class teste_2{
    public static class Aluno{
        int age = 28;
        String name = "abacaxi";
        String crime = "*****";
    }
    public class product {
        float price = 0;
        String name = "";
        int avaiable = 0;
        float money = 0;
        void sell(product produto,int amount, int price) {
            if (amount>produto.avaiable) {
                System.out.println("A quantidade descrita excede a quantidade de produtos no estoque");
                return;}
            produto.avaiable = produto.avaiable-amount;
            produto.money = produto.money+amount*price;
            System.out.println("Foi reduzido o estoque em:"+amount+"\nQuantidade restante:"+produto.avaiable);
            return;}}
        void show(product produto) {
            System.out.println("Informações:\nPreço:"+produto.price+"\nNome:"+produto.name+"\nAvaiable:"+produto.avaiable+"\nLucro:"+produto.money);
        }
    public void abacate() {
        product abacaxi = new product();
        abacaxi.avaiable = 10;
        abacaxi.money = 0;
        abacaxi.name = "abacaxi";
        abacaxi.price = 4;
        abacaxi.sell(abacaxi,4,4);
    }
    public static void main(String[]args) {
        int[] array = {141,52,3,63,13133,612111,3,1,0,4,65};
    }
    }
   







    // static void insertion_sort(int[] array) {
    //     int index = 1;
    //     while (index<array.length) {
    //         int j = index-1;
    //         while (j>=0 && array[j]>array[j+1]) {
    //             int vrl = array[j];
    //             array[j] = array[j+1];
    //             array[j+1] = vrl;
    //             j = j-1;
    //         }
    //     index++;
    //     }}
    // static void quick_sort(int[] array) {
    //     int leader = array[0];
    //     ArrayList<> higher = {};
    //     ArrayList<> lower = {};
    //     int index = 0;
    //     while (index<array.length) {
    //         if (array[index]>leader) {
    //             higher.add(array[index]);
    //             index++;
    //             continue;}
    //         lower.add(array[index]);
    //         index++;
    //         }
    //     }}