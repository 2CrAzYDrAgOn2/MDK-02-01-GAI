public class Person {
    private String name, familia, otchestvo, data, propiska, pol;
    
    public Person(String name, String familia, String otchestvo, String data, String propiska, String pol){
        this.name = name; 
        this.familia = familia;
        this.otchestvo = otchestvo;
        this.data = data;
        this.propiska = propiska;
        this.pol = pol;
    }

    public void Vivod(){
        System.out.println("Имя: " + name + "\nФамилия: " + familia + "\nОтчество: " + otchestvo + "\nДата рождения: " + data + "\nГород: " + propiska + "\nПол: " + pol + "\n");
    }
}
