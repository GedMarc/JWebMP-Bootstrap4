JW_APP_NAME.directive('ngShowBootstrapModal', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngShowBootstapModal);
        element.on('show.bs.modal', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
