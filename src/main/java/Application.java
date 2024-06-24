import javax.imageio.ImageTranscoder;
import java.util.Objects;
import java.util.Scanner;


public class Application {
    public static Car getCheapestCar(Car[] cars, int size) {
        Car cheapestCar = cars[0];

        for (int i = 0; i < size; i++) {
            if (cars[i].getCost() < cheapestCar.getCost())
                cheapestCar = cars[i];
        }

        return cheapestCar;
    }

    public static void sortCarsByYear(Car[] cars, int size) {
        for (int i = 1; i < size; i++) {
            int j = i - 1;
            while (j >= 0 && cars[j].getYearOfRelease() < cars[j + 1].getYearOfRelease()) {
                Car t = cars[j];
                cars[j] = cars[j + 1];
                cars[j + 1] = t;
                j--;
            }
        }
    }

    public static Car getCarByRegistrationNumber(Car[] cars, int size, String registrationNumber) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(cars[i].getRegistrationNumber(), registrationNumber))
                return cars[i];
        }

        return null;
    }

    private static void printModels() {
        System.out.println("choose model to set:");
        System.out.println("1 - " + CarModel.Toyota + "\n2 - " + CarModel.Hyundai + "\n3 - " + CarModel.Logan);
    }

    private static CarModel getCarModel() {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        CarModel res;
        switch (id) {
            case 1:
                res = CarModel.Toyota;
                break;
            case 2:
                res = CarModel.Hyundai;
                break;
            case 3:
                res = CarModel.Logan;
                break;
            default:
                res = null;
        }

        return res;
    }

    private static void printWrongModelTypeMassage() {
        System.out.println("Wrong model type!");
    }

    private static void printChangeMileageMassage() {
        System.out.println("Input new mileage:");
    }

    private static void printWrongMileageMassage() {
        System.out.println("Wrong mileage!");
    }

    private static void printChangeYearOfReleaseMassage() {
        System.out.println("Input new year of release:");
    }

    private static void printWrongYearOfReleaseMassage() {
        System.out.println("Wrong year of release!");
    }

    private static void printChangeCoastMassage() {
        System.out.println("Input new coast:");
    }

    private static void printWrongCoastMassage() {
        System.out.println("Wrong coast!");
    }

    public static void changeSomeValue(Car car, int valueId) {
        Scanner sc = new Scanner(System.in);
        switch (valueId) {
            case 1:
                printModels();
                CarModel model = getCarModel();
                if (model != null)
                    car.setModel(model);
                else
                    printWrongModelTypeMassage();
                break;
            case 2:
                printChangeMileageMassage();
                long mileage = sc.nextLong();
                if (mileage > 0)
                    car.setMileage(mileage);
                else
                    printWrongMileageMassage();
                break;
            case 3:
                printChangeYearOfReleaseMassage();
                int year = sc.nextInt();
                if (year > 1900 && year <= 2024)
                    car.setYearOfRelease(year);
                else
                    printWrongYearOfReleaseMassage();
                break;
            case 4:
                printChangeCoastMassage();
                long coast = sc.nextLong();
                if (coast > 0)
                    car.setCost(coast);
                else
                    printWrongCoastMassage();
                break;
            default:
                System.out.println("wrong option!");
        }
    }

        public static void main (String[]args){
            Car[] cars = new Car[3];
            cars[0] = new Car(CarModel.Hyundai, "123", 30000, 1986, 300000000);
            cars[1] = new Car(CarModel.Logan, "321", 5000, 2000, 150000000);
            cars[2] = new Car(CarModel.Toyota, "111", 3000, 2022, 450000000);

            Scanner sc = new Scanner(System.in);
            boolean NeedToContinue = true;
            while (NeedToContinue){
                System.out.println("1 - print cheapest car\n2 - sort by year\n3 - change some car\n0 - exit");
                int i = sc.nextInt();

                switch (i){
                    case 0:
                        NeedToContinue = false;
                        break;
                    case 1:
                        System.out.println(getCheapestCar(cars, 3));
                        break;
                    case 2:
                        sortCarsByYear(cars, 3);
                        System.out.println(cars[0] + "\n" + cars[1] + "\n" + cars[2]);
                        break;
                    case 3:
                        System.out.print("input reg-number: ");
                        String regNum = sc.next();
                        Car c = getCarByRegistrationNumber(cars, 3,  regNum);
                        if(c != null){
                            System.out.println("1 - change car model\n2 - change mileage\n3 - change year of release\n4 - change coast");
                            int id = sc.nextInt();
                            changeSomeValue(c, id);
                            System.out.println(c);
                        }else{
                            System.out.println("No car with this reg-number");
                        }
                        break;
                    default:
                        System.out.println("Wrong number");
                }
            }
        }
    }