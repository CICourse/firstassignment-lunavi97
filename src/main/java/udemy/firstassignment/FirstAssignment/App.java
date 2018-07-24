package udemy.firstassignment.FirstAssignment;

import java.math.BigInteger;

/**
 * Hello world!
 *
 */
public interface App 
{
    /**
     * @param n
     * @return Número de Fibonacci
     * @throws Exception
     */
    public abstract BigInteger fibonacci(int n) throws Exception;
    
    /**
     * @param n
     * @return Número de Lucas
     * @throws Exception
     */
    public abstract BigInteger lucas(int n) throws Exception;
    
    /**
     * @param n
     * @return Número de Pell
     * @throws Exception
     */
    public abstract BigInteger pell(int n) throws Exception;
    
    /**
     * @param n
     * @return Número de Pell-Lucas
     * @throws Exception
     */
    public abstract BigInteger pellLucas(int n) throws Exception;
    
    /**
     * @param n
     * @return Número de Jacobsthal
     * @throws Exception
     */
    public abstract BigInteger jacobsthal(int n) throws Exception;
    
    /**
     * @param n
     * @return Número de Jacobsthal-Lucas
     * @throws Exception
     */
    public abstract BigInteger jacobsthalLucas(int n) throws Exception;
    
    /**
     * @param n
     * @return Número de Mersenne
     * @throws Exception
     */
    public abstract BigInteger mersenne(int n) throws Exception;
    
    /**
     * @param n
     * @return Número de Fermat
     * @throws Exception
     */
    public abstract BigInteger fermat(int n) throws Exception;
    
    /**
     * @param n
     * @param b - Base
     * @return Repituno
     * @throws Exception
     */
    public abstract BigInteger repituno(int n, int b) throws Exception;
    
    /**
     * @param n
     * @return Factorial
     * @throws Exception
     */
    public abstract BigInteger factorial(int n) throws Exception;
}
