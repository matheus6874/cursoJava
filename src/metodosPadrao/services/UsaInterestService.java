package metodosPadrao.services;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService{

    private double interestRate;

    public UsaInterestService(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestService() {
        return interestRate;
    }

}
