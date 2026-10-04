package F7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C;
import c7.C2953e;
import c7.E;
import c7.F;
import com.prism.gaia.naked.metadata.com.android.internal.telephony.IMmsCAG;

/* JADX INFO: loaded from: classes6.dex */
public class a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39849e = "imms";

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        c2953e.f(new F("sendMessage", 1));
        c2953e.f(new F("downloadMessage", 1));
        c2953e.f(new C("importTextMessage"));
        c2953e.f(new C("importMultimediaMessage"));
        c2953e.f(new C("deleteStoredMessage"));
        c2953e.f(new C("deleteStoredConversation"));
        c2953e.f(new C("updateStoredMessageStatus"));
        c2953e.f(new C("archiveStoredConversation"));
        c2953e.f(new C("addTextMessageDraft"));
        c2953e.f(new C("addMultimediaMessageDraft"));
        c2953e.f(new F("sendStoredMessage", 1));
        c2953e.f(new C("setAutoPersisting"));
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IMmsCAG.f165991G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f39849e;
    }
}
