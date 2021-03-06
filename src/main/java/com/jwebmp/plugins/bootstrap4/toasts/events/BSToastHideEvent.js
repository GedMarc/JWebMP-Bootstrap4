JW_APP_NAME.directive('ngBsToastHideDirective', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngBsToastShowDirective);
        element.on('hide.bs.toast', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
