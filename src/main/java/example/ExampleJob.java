package example;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ExampleJob extends QuartzJobBean {

    private int timeout;

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("This is Example Job running...");
    }
}
