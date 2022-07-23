package ApplicationReZerV.Password;

//программа для генерации пароля длины в зависимости от выбора пользователя
public class Passwordd {
    public static void main(String[] args) {
        Generation gen = new Generation();
        gen.getcountV();
        //System.out.println(gen.getCountValue());
        for(int i = 0; i < 4; i++)
            gen.getPassword();
    }

}
