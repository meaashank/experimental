package org.apache.commons.io;

/* JADX INFO: loaded from: classes6.dex */
class ThreadMonitor implements Runnable {
    private final Thread thread;
    private final long timeout;

    private ThreadMonitor(Thread thread, long j10) {
        this.thread = thread;
        this.timeout = j10;
    }

    private static void sleep(long j10) throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis() + j10;
        do {
            Thread.sleep(j10);
            j10 = jCurrentTimeMillis - System.currentTimeMillis();
        } while (j10 > 0);
    }

    public static Thread start(long j10) {
        return start(Thread.currentThread(), j10);
    }

    public static void stop(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            sleep(this.timeout);
            this.thread.interrupt();
        } catch (InterruptedException unused) {
        }
    }

    public static Thread start(Thread thread, long j10) {
        if (j10 <= 0) {
            return null;
        }
        Thread thread2 = new Thread(new ThreadMonitor(thread, j10), "ThreadMonitor");
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }
}
