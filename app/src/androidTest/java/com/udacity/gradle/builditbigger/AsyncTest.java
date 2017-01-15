package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(AndroidJUnit4.class)
public class AsyncTest {
    private static String LOG_TAG = "Test";

    @Test
    public void testAsync() {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(InstrumentationRegistry.getTargetContext(), null);
        String ans = null;
        try {
            ans = endpointsAsyncTask.get();
            if (ans.contains("ERROR:"))
                ans = null;
            else
                Log.d(LOG_TAG, "Successful: " + ans);
        } catch (Exception e){
            e.printStackTrace();
        }
        assertNotNull(ans);
    }
}
