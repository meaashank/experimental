package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.i;
import com.bykv.vk.openvk.preload.b.l;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f140423d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in2) throws Throwable {
        new c(bVar);
        this.f140423d = a(in2);
        l.a aVar = a().get(this.f140423d);
        while (aVar != null) {
            List<h> list = aVar.f140426a;
            try {
                Object objA = c.a(list, bVar.f140419a, this).a(in2);
                return !l.a(list) ? objA : bVar.a(objA);
            } catch (i.a e10) {
                Throwable cause = e10.getCause();
                new c(bVar);
                this.f140423d = a(in2, cause, this.f140423d);
                aVar = a().get(this.f140423d);
            } catch (Throwable th) {
                new c(bVar);
                this.f140423d = a(in2, th, this.f140423d);
                aVar = a().get(this.f140423d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f140423d);
    }

    public abstract String a(IN in2);

    public abstract String a(IN in2, Throwable th, String str);
}
