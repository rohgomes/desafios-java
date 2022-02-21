public static boolean desafio2(String senha) {
        String expressionReg = "^(?=.*[0-9])"
                + "(?=.[a-z])(?=.[A-Z])"
                + "(?=.[!@#$%^&()-+])"
                + "(?=\\S+$).{6}$";

        Pattern p = Pattern.compile(expressionReg);


        if (senha == null) {
            return false;
        }

        Mat m = p.mat(senha);

        return m.mat();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome");
        String nome = scanner.next();
        System.out.println("Senha");
        String senha = scanner.next();



        System.out.println(desafio2(senha));
    }
}