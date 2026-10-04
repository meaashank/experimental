package W7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.InterfaceC2949a;
import c7.x;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC2949a(a.class)
public class d extends AbstractC2950b<IInterface> {
    public d(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        g(new x());
        f(new b("getNaiForSubscriber"));
        f(new b("getDeviceSvn"));
        f(new b("getDeviceSvnUsingSubId"));
        f(new b("getGroupIdLevel1"));
        f(new b("getGroupIdLevel1ForSubscriber"));
        f(new b("getLine1Number"));
        f(new b("getLine1NumberForSubscriber"));
        f(new b("getLine1AlphaTag"));
        f(new b("getLine1AlphaTagForSubscriber"));
        f(new b("getMsisdn"));
        f(new b("getMsisdnForSubscriber"));
        f(new b("getVoiceMailNumber"));
        f(new b("getVoiceMailNumberForSubscriber"));
        f(new b("getVoiceMailAlphaTag"));
        f(new b("getVoiceMailAlphaTagForSubscriber"));
    }
}
