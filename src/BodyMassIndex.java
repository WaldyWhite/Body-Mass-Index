public class BodyMassIndex {
    int weight;
    double height;

    public BodyMassIndex(int weight, double height) {
        this.height = height;
        this.weight = weight;
    }

    public void bodyMassIndex() {
        double result = weight / (height * height);
        if (result <= 18.5) {
            System.out.println(String.format("%.1f",result) + " -> Недостаточная (дефицит) масса тела.");
        } else if (result <= 25) {
            System.out.println(String.format("%.1f",result) + " -> Норма.");
        } else if (result <= 30) {
            System.out.println(String.format("%.1f",result) + " -> Избыточная масса тела (предожирение).");
        } else if (result <=35) {
            System.out.println(String.format("%.1f",result) + " -> Ожирение 1 степени.");
        }
    }
}
