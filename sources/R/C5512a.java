package r;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.s;
import e.G;
import e.e0;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5512a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f227107e = "AsyncLayoutInflater";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LayoutInflater f227108a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler.Callback f227111d = new C0867a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f227109b = new Handler(this.f227111d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f227110c = d.b();

    /* JADX INFO: renamed from: r.a$a, reason: collision with other inner class name */
    public class C0867a implements Handler.Callback {
        public C0867a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            if (cVar.f227117d == null) {
                cVar.f227117d = C5512a.this.f227108a.inflate(cVar.f227116c, cVar.f227115b, false);
            }
            cVar.f227118e.a(cVar.f227117d, cVar.f227116c, cVar.f227115b);
            C5512a.this.f227110c.d(cVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: r.a$b */
    public static class b extends LayoutInflater {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[] f227113a = {"android.widget.", "android.webkit.", "android.app."};

        public b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View viewCreateView;
            for (String str2 : f227113a) {
                try {
                    viewCreateView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (viewCreateView != null) {
                    return viewCreateView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* JADX INFO: renamed from: r.a$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C5512a f227114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewGroup f227115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f227116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public View f227117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e f227118e;
    }

    /* JADX INFO: renamed from: r.a$d */
    public static class d extends Thread {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f227119c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayBlockingQueue<c> f227120a = new ArrayBlockingQueue<>(10);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s.c<c> f227121b = new s.c<>(10);

        static {
            d dVar = new d();
            f227119c = dVar;
            dVar.start();
        }

        public static d b() {
            return f227119c;
        }

        public void a(c cVar) {
            try {
                this.f227120a.put(cVar);
            } catch (InterruptedException e10) {
                throw new RuntimeException("Failed to enqueue async inflate request", e10);
            }
        }

        public c c() {
            c cVarA = this.f227121b.a();
            return cVarA == null ? new c() : cVarA;
        }

        public void d(c cVar) {
            cVar.f227118e = null;
            cVar.f227114a = null;
            cVar.f227115b = null;
            cVar.f227116c = 0;
            cVar.f227117d = null;
            this.f227121b.b(cVar);
        }

        public void e() {
            try {
                c cVarTake = this.f227120a.take();
                try {
                    cVarTake.f227117d = cVarTake.f227114a.f227108a.inflate(cVarTake.f227116c, cVarTake.f227115b, false);
                } catch (RuntimeException e10) {
                    Log.w(C5512a.f227107e, "Failed to inflate resource in the background! Retrying on the UI thread", e10);
                }
                Message.obtain(cVarTake.f227114a.f227109b, 0, cVarTake).sendToTarget();
            } catch (InterruptedException e11) {
                Log.w(C5512a.f227107e, e11);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                e();
            }
        }
    }

    /* JADX INFO: renamed from: r.a$e */
    public interface e {
        void a(@NonNull View view, @G int i10, @Nullable ViewGroup viewGroup);
    }

    public C5512a(@NonNull Context context) {
        this.f227108a = new b(context);
    }

    @e0
    public void a(@G int i10, @Nullable ViewGroup viewGroup, @NonNull e eVar) {
        if (eVar == null) {
            throw new NullPointerException("callback argument may not be null!");
        }
        c cVarC = this.f227110c.c();
        cVarC.f227114a = this;
        cVarC.f227116c = i10;
        cVarC.f227115b = viewGroup;
        cVarC.f227118e = eVar;
        this.f227110c.a(cVarC);
    }
}
