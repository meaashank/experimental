package A5;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.datatransport.TransportRegistrar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements ComponentFactory {
    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return TransportRegistrar.a(componentContainer);
    }
}
