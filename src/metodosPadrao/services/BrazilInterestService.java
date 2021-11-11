package metodosPadrao.services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService{
    private double interestRate;

    public BrazilInterestService(double interestRate){
        this.interestRate = interestRate;
    }


    @Override
    public double getInterestService() {
        return interestRate;
    }
}
