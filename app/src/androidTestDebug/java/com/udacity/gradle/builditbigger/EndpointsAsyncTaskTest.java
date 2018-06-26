package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by David Llorca <davidllorcabaron@gmail.com> on 26/06/18.
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    private TellJoke jokeTeller = new TellJoke() {
        @Override
        public void tell(String Joke) {

        }
    };

    @Test
    public void verifyAsyncTask() {
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
        String result = asyncTask.doInBackground(jokeTeller);
        assertEquals("this is a awesome joke", result);
    }
}