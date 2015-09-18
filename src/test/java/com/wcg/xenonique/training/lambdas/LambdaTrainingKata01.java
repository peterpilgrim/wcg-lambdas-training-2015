package com.wcg.xenonique.training.lambdas;

import org.junit.Before;
import org.junit.Test;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by ppilgrim on 17-Sep-2015.
 */
public class LambdaTrainingKata01 extends AbstractCodingKata {

    private WorkerTaskLibraryEngine workerEngine;

    @Before
    public void setup() {
        workerEngine = new WorkerTaskLibraryEngine();
    }

    @Test
    public void learn_about_anonymous_inner_classes() {
        // NOTE: This is an important note

        // NOTE: COMMENT_OUT_THIS_LINE
        complete();

        // Submit a work item to the engine.
        workerEngine.submitWorkItem(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is verbose way - before JDK 8");
            }
        });

        // STUDENT: Where you see this prefix means that is an exercise or kata for you to complete!
    }

    @Test
    public void learn_about_define_lambdas() {

        // Submit a work item to the engine.
        // COMMENT_OUT_THIS_LINE
        complete();

        // here is the compact way
        workerEngine.submitWorkItem(() -> System.out.println("do it"));

        // Submit a work item to the engine.
        workerEngine.submitWorkItem( ()-> { System.out.println("do it alternative"); });

        workerEngine.submitWorkItem( ()-> {
            String message = "hello world";
            System.out.println("Message: "+message);
        });
    }

    @Test
    public void learn_about_defining_to_lambdas() {

        // Submit a task item to the engine.

        final Runnable noArguments = () -> System.out.println("White Clarke Group");

        // final Runnable yourMultiStatementLambda = () -> { .... };

        ActionListener buttonActionOneArgument = (event) -> System.out.println("Swing Button was click");

        complete();

        // STUDENT: ---> Now ... Invoke these lambdas
        //
        // Here is a big clue
        // noArguments.run();
    }


    @Test
    public void learn_about_lambdas_inside_another_lambdas() {

        // Submit a task item to the engine.

        final Runnable outside = () -> {

            System.out.print("Mary ");

            final Runnable inside1 = () -> {

                final Runnable inside2 = () -> {
                    System.out.println("little lamb. ");

                };

                System.out.print("had a ");
            };

            // How do I invoke the inner Lambdas?
        };

        complete();
        // STUDENT: ---> Now ... Invoke these lambdas
        //
    }


    @Test
    public void learn_how_lambdas_can_return_values() {

        Callable<String> favouriteColour = () -> "Red";
        Callable<Integer> randomElement = () -> (int)Math.rint(10000.0);
        Callable<Double> evaluateConstant = () -> Math.PI;

        complete();
        // STUDENT: ---> Now ... Invoke these lambdas
        //
    }

    @Test
    public void learn_lambdas_functional_interfaces_01() {
        Function<Integer,Integer> incrementer = (x) -> x + 1;
        Function<Integer,Integer> decrementer = (x) -> x - 1;
        Function<Integer,Integer> add10 = (x) -> x + 10;

        complete();
        // STUDENT: ---> Now ... Invoke these lambdas
        // HINT:
        // System.out.printf("incrementer.apply(4) = %d", incrementer.apply(4));
    }

    @Test
    public void learn_lambdas_functional_interfaces_02() {
        Function<Double, Double> incrementer = (x) -> x + 1;
        Function<Double, Double> decrementer = (x) -> x - 1;
        Function<Double, Double> zoom10 = (x) -> x * 10;
        Function<Double, Double> unzoom10 = (x) -> x * 10;

        complete();
        // STUDENT: ---> Now ... Invoke these lambdas
        // HINT:
        // System.out.printf("incrementer.apply(4) = %d", incrementer.apply(4));


    }

    @Test
    public void learn_lambdas_functional_interfaces_03() {

        List< Function<Double, Double>> operationList = Arrays.asList(
                (x) -> x + 3,
                (y) -> y * 10,
                (z) -> z - 2.5,
                (p) -> p / 2 );

        double value = 4;

        complete();
        // STUDENT: ---> Now ... Invoke these lambdas
        // HINT:
        //        for ( Function<Double, Double> operation: operationList ) {
        //            value = ...( ... );
        //        }

        System.out.printf("Final value = %8.3f\n", value );
        assertThat(value, is(closeTo(33.750, 0.001)));
    }


    @Test
    public void learn_about_lexical_scope_01() {

        int index = 0;

        Runnable generateSpreadsheet = () -> {
            for ( int row=0; row < 3; ++row) {
                for ( int column=0; column < 4; ++column) {

                    doSomething( String.format("calculate the info in each cell(%d,%d)", row, column));

                    // STUDENT: uncomment this next line.
                    // index++;

                    // What happens?
                    // Why does this not work?
                }
            }
        };


        complete();

        // STUDENT: ---> Now ... Invoke these lambdas
        // HINT:

        System.out.printf("index = %d\n", index);
    }


    @Test
    public void learn_about_lexical_scope_02() {

        AtomicInteger index = new AtomicInteger();

        Runnable generateSpreadsheet = () -> {
            for ( int row=0; row < 3; ++row) {
                for ( int column=0; column < 4; ++column) {

                    doSomething( String.format("calculate the info in each cell(%d,%d)", row, column));

                    // STUDENT: uncomment this next line.
                    // index.incrementAndGet();

                    // What is happens?
                    // Why does this work?
                }
            }
        };


        complete();

        // STUDENT: ---> Now ... Invoke these lambdas
        System.out.printf("index = %d\n", index.get());
    }

    @Test
    public void learn_about_binary_operations_01() {
        BinaryOperator<Double> adder1 = (x, y) -> x + y;
        BinaryOperator<Double> adder2 = (a, b) -> a + b;

        complete();

        // STUDENT: ---> Now ... Invoke these lambdas
        // HINT:
        // NOTE: compile weirdness. Force the compiler to understand literals are actually Double
        // System.out.printf(" adder1.apply(2,3) = %8.3f\n", adder1.apply(2, 3) );
        // System.out.printf(" adder1.apply(2.0,3.0) = %8.3f\n", adder1.apply(2.0, 3.0) );

        // STUDENT: What happens here!?
        assertThat(adder1, is(adder2));
    }


    @Test
    public void learn_about_binary_operations_02() {
        final BinaryOperator<Double> adder = (d1, d2) -> d1;
        final BinaryOperator<Double> multiplier = (foo, bar) -> bar;

        final LambdaArithmeticCalculator calculator = new LambdaArithmeticCalculator(adder, multiplier);

        // STUDENT: ---> Now ... complete the unit test so that these methods pass
        complete();

        assertThat(calculator.add(1.234567, 2.345678), is(closeTo(3.5802, 0.0001)));
        assertThat(calculator.multiply(2.5000, 4.0000), is(closeTo(10.000, 0.0001)));
        assertThat(calculator.subtract(100.0, 75.750), is(closeTo(24.250, 0.0001)));
        assertThat(calculator.divide(51.2321, 3.251), is(closeTo(15.7588, 0.0001)));
    }
}
