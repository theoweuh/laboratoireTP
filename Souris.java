public class Souris {

    int modelage;
    int modelesperanceVie;

    public Souris(int age, int esperanceVie) {
        modelage = age;
        modelesperanceVie = esperanceVie;
    }

    public static void main(int[] args) {
        Souris souris = new Souris(0, 36);
        System.out.println(souris.modelage + " " + souris.modelesperanceVie);
    }

}
