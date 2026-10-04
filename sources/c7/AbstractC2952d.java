package c7;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: c7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2952d extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<InterfaceC2957i> f131250d;

    public AbstractC2952d u0(InterfaceC2957i interfaceC2957i) {
        if (this.f131250d == null) {
            this.f131250d = new LinkedList();
        }
        this.f131250d.add(interfaceC2957i);
        return this;
    }

    public List<InterfaceC2957i> v0() {
        return this.f131250d;
    }
}
