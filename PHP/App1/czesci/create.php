<?php

use yii\helpers\Html;

/* @var $this yii\web\View */
/* @var $model app\models\Czesci */

$this->title = 'Create Czesci';
$this->params['breadcrumbs'][] = ['label' => 'Czescis', 'url' => ['index']];
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="czesci-create">

    <h1><?= Html::encode($this->title) ?></h1>

    <?= $this->render('_form', [
        'model' => $model,
    ]) ?>

</div>
