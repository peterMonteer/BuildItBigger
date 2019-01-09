package com.udacity.gradle.builditbigger;

import android.app.Activity;
import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    private Context context;

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void initContext(){
        context = mActivityTestRule.getActivity().getBaseContext();
    }

    @Test
    public void testVerifyAsyncTaskResponse() {
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(context);
        try {
            result = endpointsAsyncTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        assert result!=null;
    }
}
