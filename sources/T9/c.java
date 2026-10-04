package T9;

import android.content.Context;
import com.prism.commons.utils.C3861z;
import com.tonyodev.fetch2.FetchConfiguration;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements C3861z.a {
    @Override // com.prism.commons.utils.C3861z.a
    public final Object a(Object obj) {
        return com.tonyodev.fetch2.b.f194391a.c(new FetchConfiguration.Builder((Context) obj).setDownloadConcurrentLimit(3).build());
    }
}
