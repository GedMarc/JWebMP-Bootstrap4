JW_APP_NAME.directive('bsCollapseHidden', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngActivate);
        element.on('show.bs.hidden', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
