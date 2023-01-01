package tech.powerjob.samples.processors.upupor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.powerjob.common.utils.NetUtils;
import tech.powerjob.worker.core.processor.ProcessResult;
import tech.powerjob.worker.core.processor.TaskContext;
import tech.powerjob.worker.core.processor.TaskResult;
import tech.powerjob.worker.core.processor.sdk.BasicProcessor;
import tech.powerjob.worker.core.processor.sdk.BroadcastProcessor;
import tech.powerjob.worker.log.OmsLogger;

import java.util.List;

/**
 * @author Yang Runkang (cruise)
 * @createTime 2023-01-02 00:12
 * @email: yangrunkang53@gmail.com
 */
@Slf4j
@Component
public class UpuporProcessorDemo implements BasicProcessor {


    @Override
    public ProcessResult process(TaskContext taskContext) throws Exception {
        OmsLogger logger = taskContext.getOmsLogger();
        System.out.println("===== UpuporProcessorDemo#process ======");
        logger.info("UpuporProcessorDemo#process, current host: {}", NetUtils.getLocalHost());
//        long sleepTime = 1000;
//        try {
//            sleepTime = Long.parseLong(taskContext.getJobParams());
//        }catch (Exception e) {
//            logger.warn("[BroadcastProcessor] parse sleep time failed!", e);
//        }
//        Thread.sleep(Math.max(sleepTime, 1000));
        return new ProcessResult(true);
    }

}
