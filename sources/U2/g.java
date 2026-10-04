package U2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.K;
import androidx.lifecycle.N;
import androidx.lifecycle.Q;
import p.InterfaceC5376a;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class g {

    /* JADX INFO: Add missing generic type declarations: [In] */
    public class a<In> implements Q<In> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Out f68420a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V2.a f68421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f68422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5376a f68423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ N f68424e;

        /* JADX INFO: renamed from: U2.g$a$a, reason: collision with other inner class name */
        public class RunnableC0116a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f68425a;

            public RunnableC0116a(final Object val$input) {
                this.f68425a = val$input;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.f68422c) {
                    try {
                        ?? Apply = a.this.f68423d.apply(this.f68425a);
                        a aVar = a.this;
                        Out out = aVar.f68420a;
                        if (out == 0 && Apply != 0) {
                            aVar.f68420a = Apply;
                            aVar.f68424e.o(Apply);
                        } else if (out != 0 && !out.equals(Apply)) {
                            a aVar2 = a.this;
                            aVar2.f68420a = Apply;
                            aVar2.f68424e.o(Apply);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public a(final V2.a val$workTaskExecutor, final Object val$lock, final InterfaceC5376a val$mappingMethod, final N val$outputLiveData) {
            this.f68421b = val$workTaskExecutor;
            this.f68422c = val$lock;
            this.f68423d = val$mappingMethod;
            this.f68424e = val$outputLiveData;
        }

        @Override // androidx.lifecycle.Q
        public void a(@Nullable final In input) {
            this.f68421b.d(new RunnableC0116a(input));
        }
    }

    public static <In, Out> K<Out> a(@NonNull K<In> inputLiveData, @NonNull final InterfaceC5376a<In, Out> mappingMethod, @NonNull final V2.a workTaskExecutor) {
        Object obj = new Object();
        N n10 = new N();
        n10.s(inputLiveData, new a(workTaskExecutor, obj, mappingMethod, n10));
        return n10;
    }
}
