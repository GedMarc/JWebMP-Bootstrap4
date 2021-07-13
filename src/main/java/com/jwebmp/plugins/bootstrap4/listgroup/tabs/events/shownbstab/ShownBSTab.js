JW_APP_NAME.directive('shownBsTab', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.shownBsTab);
        element.on('shown.bs.tab', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
