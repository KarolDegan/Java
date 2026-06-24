public class TesteData {
    public static void main (String args[])
	{
		Data data = new Data(29, 2, 2024);
		System.out.println("Meu aniversário: " + data.toString());

		data.setData(31, 02, 2024);
		System.out.println("Que data é essa? " + data.toString());

        Data data1, data2, data3;
		data1 = new Data(02, 9, 2024);
		data2 = new Data(2023);
		data3 = new Data(12, 2025);

		System.out.println(
		" Hoje é " + data1.toString() +
		" ingressei no primeiro semestre de " + data2.getAno() +
		" e me formarei em " +	data3.getMes()+"/"+data3.getAno());


	}
}
