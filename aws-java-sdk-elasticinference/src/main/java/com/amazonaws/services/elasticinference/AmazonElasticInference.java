/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticinference;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.elasticinference.model.*;

/**
 * Interface for accessing Amazon Elastic Inference.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticinference.AbstractAmazonElasticInference} instead.
 * </p>
 * <p>
 * Elastic Inference public APIs.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonElasticInference {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "elastic-inference";

    /**
     * Returns all tags of an Elastic Inference Accelerator.
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         Raised when a malformed input has been provided to the API.
     * @throws ResourceNotFoundException
     *         Raised when the requested resource cannot be found.
     * @throws InternalServerException
     *         Raised when an unexpected error occurred during request processing.
     * @sample AmazonElasticInference.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Adds the specified tag(s) to an Elastic Inference Accelerator.
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         Raised when a malformed input has been provided to the API.
     * @throws ResourceNotFoundException
     *         Raised when the requested resource cannot be found.
     * @throws InternalServerException
     *         Raised when an unexpected error occurred during request processing.
     * @sample AmazonElasticInference.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * Removes the specified tag(s) from an Elastic Inference Accelerator.
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         Raised when a malformed input has been provided to the API.
     * @throws ResourceNotFoundException
     *         Raised when the requested resource cannot be found.
     * @throws InternalServerException
     *         Raised when an unexpected error occurred during request processing.
     * @sample AmazonElasticInference.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
