package io.github.mgora.pushnotifier;

import io.github.mgora.pushnotifier.api.model.message.MessageResponse;
import io.github.mgora.pushnotifier.api.model.message.PushMessage;

public interface PushnotifierClient {

	MessageResponse send(PushMessage message);

}
