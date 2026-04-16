package JavaArrays;

public class Practice6 {

    public static void main(String[] args) {
        float[] f = new float[2];

        f[0] = 1339887f;
        f[1] = 65451565f;

        float result = 0;

        for(int i = 0; i < f.length; i++)
        {
            result = f[0] / f[1];
            System.out.println(result);
        }
    }
}