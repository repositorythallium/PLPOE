var gerenciadorPontoEletronicoModelModule = angular.module("gerenciadorPontoEletronicoModelModule", []);

gerenciadorPontoEletronicoModelModule.controller("gerenciadorPontoEletronicoModelController", function($scope) {
	
	$scope.moduleName = "Registro de Ponto Eletrônico";
	
	$scope.gerenciadorPontoEletronicoModel = {};
	
	function incializador() { };
	
	$scope.save = function(gerenciadorPontoEletronicoModel) {
		console.log(gerenciadorPontoEletronicoModel);
	}
	
});