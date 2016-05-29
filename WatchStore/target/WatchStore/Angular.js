angular.module('myApp', []).controller('namesCtrl', function($scope) {
    $scope.names = [
        {p_name:'Watches_1',p_id:'123',p_cost:'1001'},
        {p_name:'Watches_2',p_id:'456',p_cost:'1002'},
        {p_name:'Watches_3',p_id:'567',p_cost:'1003'},
    ];
});