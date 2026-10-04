package d6;

/* JADX INFO: renamed from: d6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC4300a<Actor, Result> {

    /* JADX INFO: renamed from: d6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0717a {
        void a();
    }

    /* JADX INFO: renamed from: d6.a$b */
    public interface b {
        void a();
    }

    /* JADX INFO: renamed from: d6.a$c */
    public interface c {
        void onCancel();
    }

    /* JADX INFO: renamed from: d6.a$d */
    public interface d {
        void a(Throwable th, String str);
    }

    /* JADX INFO: renamed from: d6.a$e */
    public interface e<T> {
        void onSuccess(T t10);
    }

    InterfaceC4300a<Actor, Result> a(e<Result> eVar);

    InterfaceC4300a<Actor, Result> b(InterfaceC0717a interfaceC0717a);

    InterfaceC4300a<Actor, Result> c(d dVar);

    InterfaceC4300a<Actor, Result> d(b bVar);

    void e(Actor actor);

    InterfaceC4300a<Actor, Result> f(c cVar);
}
