package demoapp

class DemoController {

    def messageSource

    def show() {
        [fruits: messageSource.listMessageCodes(request.locale, "fruit"),
        squares: messageSource.listMessageCodes(request.locale, "square"),
        circles: messageSource.listMessageCodes(request.locale, "circle"),
        blackColorItems:messageSource.listMessageCodes(request.locale, "black"),
        redColorItems:messageSource.listMessageCodes(request.locale, "red")]
    }
}
