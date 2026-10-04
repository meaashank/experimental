package v8;

import android.app.job.JobInfo;
import android.app.job.JobWorkItem;
import android.os.IBinder;
import android.os.RemoteException;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.server.X;
import java.util.List;
import p6.C5395b;
import p6.c;

/* JADX INFO: renamed from: v8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5709s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C5709s f239899b = new C5709s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5395b<X> f239900a = GProcessClient.f164187n.d6("job", X.class, new a());

    /* JADX INFO: renamed from: v8.s$a */
    public class a implements c.a<X> {
        public a() {
        }

        @Override // p6.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public X a(IBinder iBinder) {
            return X.b.U0(iBinder);
        }
    }

    public static C5709s d() {
        return f239899b;
    }

    public void a(int i10, String str, int i11) {
        try {
            g().Y4(i10, str, i11);
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
    }

    public void b(String str, int i10) {
        try {
            g().g4(str, i10);
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
    }

    public int c(JobInfo jobInfo, JobWorkItem jobWorkItem, String str, int i10) {
        try {
            return g().t3(jobInfo, jobWorkItem, str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public List<JobInfo> e(String str, int i10) {
        try {
            return g().K1(str, i10).getList();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public JobInfo f(int i10, String str, int i11) {
        try {
            return g().Y1(i10, str, i11);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public X g() {
        return (X) this.f239900a.b();
    }

    public int h(JobInfo jobInfo, String str, int i10) {
        try {
            return g().f1(jobInfo, str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }
}
