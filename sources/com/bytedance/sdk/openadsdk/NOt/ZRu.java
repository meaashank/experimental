package com.bytedance.sdk.openadsdk.NOt;

import com.bytedance.sdk.component.utils.Ht;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZRu {
    protected boolean ZRu = false;
    private final ExecutorService NOt = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.NOt.ZRu$ZRu, reason: collision with other inner class name */
    public class CallableC0427ZRu implements Callable<Void> {
        private final File NOt;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            ZRu.this.NOt(this.NOt);
            return null;
        }

        private CallableC0427ZRu(File file) {
            this.NOt = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(File file) throws IOException {
        if (!this.ZRu) {
            try {
                Ht.NOt(file);
            } catch (Throwable unused) {
            }
            ZRu(Ht.ZRu(file.getParentFile()));
        } else {
            List<File> listZRu = Ht.ZRu(file);
            listZRu.toString();
            ZRu(listZRu);
        }
    }

    public abstract void ZRu(List<File> list);

    public abstract boolean ZRu(long j10, int i10);

    public abstract boolean ZRu(File file, long j10, int i10);

    public void ZRu(File file) throws IOException {
        this.NOt.submit(new CallableC0427ZRu(file));
    }

    public long NOt(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
