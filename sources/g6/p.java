package g6;

import androidx.annotation.NonNull;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes5.dex */
public class p extends FutureTask<q> implements Comparable<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f202270a;

    public p(q qVar) {
        super(qVar, null);
        this.f202270a = qVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull p pVar) {
        return pVar.f202270a.compareTo(this.f202270a);
    }
}
