package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class e extends b {
    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(a aVar, File file, List<String> list) {
        super.a(aVar, file, list);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        Iterator<String> it = this.f140462e.iterator();
        while (it.hasNext()) {
            List<File> listB = com.bykv.vk.openvk.preload.geckox.utils.b.b(new File(this.f140461d, it.next()));
            if (listB != null && listB.size() > this.f140460c.f140453a) {
                Iterator<File> it2 = listB.subList(0, listB.size() - this.f140460c.f140453a).iterator();
                while (it2.hasNext()) {
                    com.bykv.vk.openvk.preload.geckox.a.c.b(it2.next().getAbsolutePath());
                }
            }
        }
    }
}
