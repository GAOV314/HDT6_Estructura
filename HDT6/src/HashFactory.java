public class HashFactory{

    public static IHashMap getHashInstance(int input){

        switch(input){
            case 1:
                return new HashMD5();

            case 2:
                return new HashOrganic();

            case 3:
                return new ImpHashSHA1();
            default:
                return new HashMD5();

        }


    }
}