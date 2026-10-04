package tb;

import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: tb.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC5628b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile i f239243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReentrantLock f239244b = new ReentrantLock();

    @Override // tb.g
    public h b() throws QCloudClientException {
        i iVarD = d();
        if (iVarD != null && iVarD.isValid()) {
            return iVarD;
        }
        refresh();
        return d();
    }

    public abstract i c() throws QCloudClientException;

    public final synchronized i d() {
        return this.f239243a;
    }

    public final synchronized void e(i iVar) {
        this.f239243a = iVar;
    }

    @Override // tb.g
    public void refresh() throws QCloudClientException {
        try {
            try {
                boolean zTryLock = this.f239244b.tryLock(20L, TimeUnit.SECONDS);
                if (!zTryLock) {
                    throw new QCloudClientException(new QCloudAuthenticationException("lock timeout, no credential for sign"));
                }
                i iVarD = d();
                if (iVarD == null || !iVarD.isValid()) {
                    e(null);
                    try {
                        e(c());
                    } catch (Exception e10) {
                        if (e10 instanceof QCloudClientException) {
                            throw e10;
                        }
                        throw new QCloudClientException("fetch credentials error happens: " + e10.getMessage(), new QCloudAuthenticationException(e10.getMessage()));
                    }
                }
                if (zTryLock) {
                    this.f239244b.unlock();
                }
            } catch (InterruptedException e11) {
                throw new QCloudClientException("interrupt when try to get credential", new QCloudAuthenticationException(e11.getMessage()));
            }
        } catch (Throwable th) {
            if (0 != 0) {
                this.f239244b.unlock();
            }
            throw th;
        }
    }
}
