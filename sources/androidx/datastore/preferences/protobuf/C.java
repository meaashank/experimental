package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface C extends InterfaceC2535l0 {
    EnumValue getEnumvalue(int i10);

    int getEnumvalueCount();

    List<EnumValue> getEnumvalueList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
